package Adventure;

public class Player {	//���������
	static String name;//�����
	int hp;//Ѫ��
	int att;//����
	int def;//����
	int exp;//��ǰ����
	int thisExp;//������
	int lv;//�ȼ�
	int money;//��Ǯ
	Player(String name,int lv,int hp,int att,int def,int exp,int thisExp,int money){//��ʼ������
		this.name=name;
		this.lv=lv;
		this.hp=hp;
		this.att=att;
		this.def=def;
		this.exp=exp;
		this.thisExp=thisExp;
		this.money=money;
	}
	
	
	Player(int hp){//����Ѫ��
		this.hp=hp+50;
	}
	
	
	public int attack (int def){	//��ҹ�������
		
		return att-def;
		
	}
	
	public void show(){			//��ʾ�������
		System.out.println("ID��"+"��"+name+"��");
		System.out.println("Level��"+lv);
		System.out.println("HP��"+hp);
		System.out.println("Attack��"+att);
		System.out.println("Defense��"+def);
		System.out.println("Experience��"+exp+"/"+thisExp);
		System.out.println("Coin��"+money);
		
		
	}
	public void end(){
			System.out.println("--------------------");
			System.out.println("You died��END");
			
			
			
		}
		
		
	}
	
			
		

	

	
