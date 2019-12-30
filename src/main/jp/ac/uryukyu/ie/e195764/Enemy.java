package jp.ac.uryukyu.ie.e195764;

/**
 * 敵クラス。
 */
public class Enemy extends LivingThing {

    public Enemy (String name, int maximumHP, int attack) { //コンストラクタ
        super(name,maximumHP, attack); //スーパークラスのコンストラクタ
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    int hp = getHitPoint();
    @Override
    public void wounded(int damage){
        hp -= damage;
        if( hp < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}