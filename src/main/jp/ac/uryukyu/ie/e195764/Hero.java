package jp.ac.uryukyu.ie.e195764;

/**
 * ヒーロークラス。
 */
public class Hero extends LivingThing {

    public Hero (String name, int maximumHP, int attack) { //コンストラクタ
        super(name, maximumHP, attack); //スーパークラスのコンストラクタ
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}