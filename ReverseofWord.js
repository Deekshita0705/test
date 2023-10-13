const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
rl.question('Enter a sentence: ', (sentence) => {
  const reversedSentence = sentence
    .split(' ')
    .map(word => reverseWord(word))
    .join(' ');
  console.log('Reversed sentence:', reversedSentence);
  rl.close();
});
