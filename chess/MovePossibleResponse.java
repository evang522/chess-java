package chess;

import java.util.Optional;

public class MovePossibleResponse {
    private Boolean possible;
    private Optional<String> reasonNotPossible;

    public MovePossibleResponse(Boolean possible, Optional<String> reasonNotPossible) {
        this.possible = possible;
        this.reasonNotPossible = reasonNotPossible;
    }

    public static MovePossibleResponse forPossible() {
        return new MovePossibleResponse(true, Optional.empty());
    }

    public static MovePossibleResponse forNotPossible(String reason) {
        return new MovePossibleResponse(false, Optional.of(reason));
    }

    public Boolean possible() {
        return possible;
    }

    public void setPossible(Boolean possible) {
        this.possible = possible;
    }

    public Optional<String> reasonNotPossible() {
        return reasonNotPossible;
    }

    public void setReasonNotPossible(Optional<String> reasonNotPossible) {
        this.reasonNotPossible = reasonNotPossible;
    }
}