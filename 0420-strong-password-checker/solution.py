class Solution:
    def strongPasswordChecker(self, password):
        n = len(password)
        has_lower = any(c.islower() for c in password)
        has_upper = any(c.isupper() for c in password)
        has_digit = any(c.isdigit() for c in password)

        missing_types = 3 - (has_lower + has_upper + has_digit)

        # Step 1: Count repeating sequences
        replace = 0
        one_mod = 0  # count of sequences where len % 3 == 0
        two_mod = 0  # count of sequences where len % 3 == 1
        i = 2
        while i < n:
            if password[i] == password[i - 1] == password[i - 2]:
                length = 2
                while i < n and password[i] == password[i - 1]:
                    length += 1
                    i += 1
                replace += length // 3
                if length % 3 == 0:
                    one_mod += 1
                elif length % 3 == 1:
                    two_mod += 1
            else:
                i += 1

        if n < 6:
            return max(missing_types, 6 - n)

        elif n <= 20:
            return max(missing_types, replace)

        else:
            delete = n - 20
            remaining = delete

            # First reduce sequences where len % 3 == 0
            reduce = min(one_mod, remaining)
            replace -= reduce
            remaining -= reduce

            # Then reduce sequences where len % 3 == 1
            reduce = min(two_mod * 2, remaining)
            replace -= reduce // 2
            remaining -= reduce

            # Then reduce the rest (each 3 deletions reduce one replace)
            replace -= remaining // 3

            return delete + max(missing_types, replace)

