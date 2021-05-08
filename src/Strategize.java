public class Strategize {
    Strategy strategy;
    String msg;

    public Strategize(String msg) {
        this.strategy = new Soft();
        this.msg = msg;
    }
    void communicate(){
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg + "@?";
                    }
                },
                new Soft(), Unrelated::twice,
                a->a
        };
        for (Strategy strategy : strategies) {
            System.out.println(strategy.approach("gao"));
        }
    }
}
