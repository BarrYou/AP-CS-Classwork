package Adventure;
import java.util.Random;
public class monster {
			
		String name;
		int lv;
		int hp;
		int att;
		int def;
	
	public int attack(int def){//怪物攻击方法
		return att-def;
	}

			
	monster(String name,int lv,int hp,int att,int def){//生成一个怪物
		this.name=name;
		this.lv=lv;
		this.hp=hp;
		this.att=att;
		this.def=def;
						
			
		}
	public int jjy(int money){
		return	money=this.lv*2;
	}
		public int jjq(int exp){
			return	exp=this.lv*5;
		}
			public boolean jwp(boolean wp){
			
				int sj=new Random().nextInt(2)+1;
				if(sj==2){
					return wp= true;
				}else{
					return wp=false;
				
				}
				
				}
			
				
				
	
		public void show(){			//显示玩家属性
			
			System.out.println("Monster name："+name);
			System.out.println("Monster HP："+hp);
			System.out.println("Monster Attack："+att);
			System.out.println("Monster Defense："+def);
		}
}
