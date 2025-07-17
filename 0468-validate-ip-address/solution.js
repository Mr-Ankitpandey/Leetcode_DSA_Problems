/**
 * @param {string} queryIP
 * @return {string}
 */
var validIPAddress = function(queryIP) {
    if (queryIP.includes('.')) {
        const parts = queryIP.split('.');
        if (parts.length !== 4) return "Neither";
        for (let part of parts) {
            if (!/^\d+$/.test(part)) return "Neither";
            if (part.length > 1 && part[0] === '0') return "Neither";
            if (+part < 0 || +part > 255) return "Neither";
        }
        return "IPv4";
    } else if (queryIP.includes(':')) {
        const parts = queryIP.split(':');
        if (parts.length !== 8) return "Neither";
        const hexRegex = /^[0-9a-fA-F]{1,4}$/;
        for (let part of parts) {
            if (!hexRegex.test(part)) return "Neither";
        }
        return "IPv6";
    } else {
        return "Neither";
    }
};

