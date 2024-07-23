function calculateAnswers() {
    const score = parseInt(document.getElementById('score').value);

    if (isNaN(score) || score < 180 || score > 720) {
        alert("Please enter a valid score between 180 and 720.");
        return;
    }

    // Calculate correct and incorrect answers
    const correct = (score + 180) / 5;
    const incorrect = 180 - correct;

    if (correct < 0 || incorrect < 0 || !Number.isInteger(correct) || !Number.isInteger(incorrect)) {
        alert("Invalid score entered. Please check and try again.");
        return;
    }

    // Display results
    document.getElementById('correct-answers').innerText = `Correct Answers: ${correct}`;
    document.getElementById('incorrect-answers').innerText = `Incorrect Answers: ${incorrect}`;
}
