:- module(usercode, [
  handle/2
]).

% write your code here
handle(Data, Result) :-
    put_dict(key123, Data, "val123", Result).