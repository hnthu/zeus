angular.module('surveyHandler', [])
        .controller('surveyController', function () {
        var questions = this;
        questions.list = [];
        questions.choices = [
            {text: 'Yes'},
            {text: 'No'}
        ];

        questions.addTodo = function () {
            questions.list.push({text: questions.todoText, done: false});
            questions.todoText = '';
        };

        questions.remaining = function () {
            var count = 0;
            angular.forEach(questions.list, function (question) {
                count += question.done ? 0 : 1;
            });
            return count;
        };

        questions.archive = function () {
            var oldlist = questions.list;
            questions.list = [];
            angular.forEach(oldlist, function (question) {
                if (!question.done) questions.list.push(question);
            });
        };
    });