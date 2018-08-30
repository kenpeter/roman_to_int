var romanToInt = function(s) {
	// res 0
    let res = 0;
	// map
    let map = {
        "I" : 1,
        "V" : 5,
        "X" : 10,
        "L" : 50,
        "C" : 100,
        "D" : 500,
        "M" : 1000,
        "IV" : 4,
        "IX" : 9,
        "XL" : 40,
        "XC" : 90,        
        "CD" : 400,
        "CM" : 900
    }

	// still looping char by char
    for(let i = 0; i < s.length; i ++){
		// e.g. IVX 
        if(i === s.length){
            res += map[s[i]];
            break; // out now
        }

		// e.g. IVX has IV 
        let combine = s[i] + s[i + 1];
		// but can fast forward !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        if(map[combine]){
            res += map[combine];
            i++; // fast forwrad...................................
            continue; // when i hit the loop, another ++
        }

		// else 1 char at a time
        res += map[s[i]];
    }
    return res;
};


let out = romanToInt('IV');
console.log(out);

