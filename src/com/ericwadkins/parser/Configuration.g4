
grammar Configuration;

@header {
package com.ericwadkins.parser;
}

@members {
    public void reportErrorsAsExceptions() {
        // To prevent default report to standard error, add this line:
        removeErrorListeners();
        
        addErrorListener(new BaseErrorListener() {
            public void syntaxError(Recognizer<?, ?> recognizer,
                                    Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {

                //throw new ParseCancellationException(msg, e);
                System.err.println("Invalid character: '" + ((CommonToken) offendingSymbol).getText() + "' on line: " + line + ", index: " + charPositionInLine);
                System.err.println(msg);
                System.exit(1);
            }
        });
    }
}
