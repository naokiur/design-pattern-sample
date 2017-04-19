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
    },
    VERY_POISON {
        @Override
        public Integer selectDamageAfterTurn() {
            return 20;
        }
    };


    public abstract Integer selectDamageAfterTurn();
}
