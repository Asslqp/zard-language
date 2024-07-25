public class Token {
    public enum TokenType {
        KEYWORD, IDENTIFIER, NUMBER, OPERATOR, DELIMITER, STRING, EOF
    }

    private TokenType type;
    private String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Token{type=%s, value='%s'}", type, value);
    }
}
