package Adventure;

public class Player {	//创建玩家类
	static String name;//玩家名
	int hp;//血量
	int att;//攻击
	int def;//防御
	int exp;//当前经验
	int thisExp;//经验条
	int lv;//等级
	int money;//金钱
	Player(String name,int lv,int hp,int att,int def,int exp,int thisExp,int money){//初始化属性
		this.name=name;
		this.lv=lv;
		this.hp=hp;
		this.att=att;
		this.def=def;
		this.exp=exp;
		this.thisExp=thisExp;
		this.money=money;
	}
	
	
	Player(int hp){//升级血量
		this.hp=hp+50;
	}
	
	
	public int attack (int def){	//玩家攻击方法
		
		return att-def;
		
	}
	
	public void show(){			//显示玩家属性
		System.out.println("ID："+"【"+name+"】");
		System.out.println("Level："+lv);
		System.out.println("HP："+hp);
		System.out.println("Attack："+att);
		System.out.println("Defense："+def);
		System.out.println("Experience："+exp+"/"+thisExp);
		System.out.println("Coin："+money);
		
		
	}
	public void end(){
			System.out.println("--------------------");
			System.out.println("You died！END");
			
			
			
		}
		
		
	}
	
			
		

	

	

