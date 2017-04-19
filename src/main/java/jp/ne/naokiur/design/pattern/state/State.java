package jp.ne.naokiur.design.pattern.state;

public enum State {
    NORMAL {
        @Override
        public Integer selectDamageAfterTurn() {
            return 0;
        }
    },
    POISON {
        @Override
        public Integer selectDamageAfterTurn() {
            return 10;
        }
    };


    public abstract Integer selectDamageAfterTurn();
}
