function multiplesOf(numbers, number) { // add second argument
    var multiples = []; // change to array (so that we can store multiple numbers - not just one multiple)
    for (var i = 0; i < numbers.length; i++) {
      if (numbers[i] % number === 0) { // divide by the number
        multiples.push(numbers[i]); // add the current multiple found to the multiples array
      }
    }
  
    return multiples;
  }
  
  console.log(multiplesOf([4, 5, 6, 7, 8], 2)); // Output: [4, 6, 8]