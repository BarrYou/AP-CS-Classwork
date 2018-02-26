package Adventure;

import java.util.Random;
import java.util.Scanner;

public class game {
java.util.Random rando=new java.util.Random();

	
	
	public static void main (String[] args){
		int fb;
		int cz=0;
		wupin hongpin=new wupin("Elementary HP medicine",20,0);
		wupin hongpin1=new wupin("intermediate HP medicine",100,0);
		wupin hongpin2=new wupin("Great HP medicine",500,0);
		wupin hongpin3=new wupin("Perfect HP medicine",1000,0);
		chailiao v=new  chailiao("Slime's heart",0);
		 chailiao qw=new chailiao("Slime's crown",0);
		 chailiao dj=new chailiao("Dragon's horn",0);
		 chailiao dx=new chailiao("Dragon's heart",0);
		 chailiao xbs=new chailiao("Blood-diamond",0);
		 chailiao xmn=new chailiao("Blood agate",0);
		 chailiao bqsp=new chailiao("Weapon Piece",0);
		 chailiao sbzh=new chailiao("Immortal's soul",0);
		 
		 
		System.out.println("Enter your name！");
		Scanner input=new Scanner(System.in);
		String z = input.nextLine();
		int hp=new Random().nextInt(20)+1;
		int att=new Random().nextInt(20)+1;
		int def=new Random().nextInt(10)+1;
		Player p=new Player(z,1,50+hp,att,def,0,100,0);
		if(Player.name!=null){
		
		 p.show();
		
		System.out.println("Confirm your characters！");
	
			System.out.println("-------------------");
			System.out.println("What do you want to do？");
			System.out.println("1.Check charaters");
			System.out.println("2.Explore the world");
			System.out.println("3.Enforce your charaters");
			System.out.println("4.Coin lottery");
			System.out.println("5.Exchange resources");
			System.out.println("6.Check your bag");
			System.out.println("7....");

		for(int i=1;i>0;i++){//进入游戏
			Scanner scanner=new Scanner(System.in);
			int xz= scanner.nextInt();//选项
			
			switch(xz){
			case 1:p.show(); 
			System.out.println("-------------------");
			System.out.println("What do you want to do？");
			System.out.println("1.Check charaters");
			System.out.println("2.Explore the world");
			System.out.println("3.Enforce your charaters");
			System.out.println("4.Coin lottery");
			System.out.println("5.Exchange resources");
			System.out.println("6.Check your bag");
			System.out.println("7....");
			break;
			case 2:				
			System.out.println("Choose where you wanna go!");
			System.out.println("1.Mirkwood(Lv 1-5)");
			System.out.println("2.Mysterious palace(Lv 5-10)");
			System.out.println("3.Bloody castle(Lv 10-15)");
			System.out.println("4.The entrance to sky(Lv 15-20)");
			Scanner xz2=new Scanner(System.in);
			int fbxz = xz2.nextInt();
			if(fbxz==1){//////////////////////////////////////第一关！
				fb=1;
				int wjxl=p.hp;
				
				System.out.println("Dark path leading down to the depths of the forest!~");
				//进入副本1
				System.out.println("You headed for the forests, gradually into the depths！");
				int guanka=new Random().nextInt(10)+1;
				for(int g=0;g!=guanka;g++){

					
					System.out.println("You go straight, and suddenly a slime stopped in your way！");
					System.out.println("Slime: piaji~");
					System.out.println("number"+(g+1)+" "+",total"+guanka+" ");
					monster y= new monster("Slime",1,20,10,5);
					int gwxl=y.hp;
					y.show();
					if(wjxl<=0){
						p.end();
						break;
					}
					System.out.println("1.Attack	2.Run	3.Treatment");
					Scanner scn=new Scanner(System.in);
					int a=scn.nextInt();
					if(a==1){
						cz=1;
						System.out.println("You choose to attack！");
						while(wjxl>0&&gwxl>0){
							int wjsh=0;
							int gwsh=0;

							if(p.attack(y.def)<0){
								wjsh=0;
								gwxl=gwxl-wjsh;
								System.out.println("You use your fists to hit【"+y.name+"】，making"+wjsh+"damage to it");
							}else{
								wjsh=gwxl-p.attack(y.def);
								gwxl=gwxl-p.attack(y.def);
								System.out.println("You use your fists to hit【"+y.name+"】，making"+p.attack(y.def)+"damage to it");
							}
							if(y.attack(p.def)<0){
								gwsh=0;
								wjxl=wjxl-gwsh;
								System.out.println("【"+y.name+"】use sticky ball to attack，making"+gwsh+"damage to you");
							}else{
								gwsh=y.attack(p.def);
								wjxl=wjxl-y.attack(p.def);
								System.out.println("【"+y.name+"】use sticky ball to attack，making"+y.attack(p.def)+"damage to you");
							}

							
							if(wjxl>=p.hp){
								wjxl=p.hp;
								System.out.println(p.name+"'s hp:"+wjxl+"/"+p.hp);
							}else{
								if(wjxl<0){
									wjxl=0;
									System.out.println(p.name+"'s hp:"+wjxl+"/"+p.hp);
								}else{
									wjxl=wjxl-gwsh;
									System.out.println(p.name+"'s hp:"+wjxl+"/"+p.hp);
								}

							}
							if(gwsh>=y.hp){
								gwxl=y.hp;
								System.out.println(y.name+"'s hp:"+gwxl+"/"+y.hp);
							}else{
								if(gwxl<0){
									gwxl=0;
								System.out.println(y.name+"'s hp:"+gwxl+"/"+y.hp);
								}else{
									gwxl=gwxl-wjsh;
									System.out.println(y.name+"'s hp:"+gwxl+"/"+y.hp);
								}
								}
							}

								

							if(wjxl<=0){
								p.end();
								break;
							
							}
							if(gwxl<=0){
								System.out.println("You win!!");
								p.exp=p.exp+ y.jjy(y.lv*2);
								System.out.println("Get experience:"+y.jjy(y.lv*2));
								
								p.money=p.money+ y.jjq(y.lv*5);
								System.out.println("Get coin:"+ y.jjq(y.lv*5));
								if(y.jwp(true)){


									hongpin.shuliang=hongpin.shuliang+1;
									System.out.println("Get: Elementary HP medicine*1");	
									System.out.println("----------------");	

									
								
								if(p.exp>=p.thisExp){
									p.lv=p.lv+1;
									p.hp=p.hp+20;
									p.att=p.att+10;
									p.def=p.def+10;
									p.exp=p.exp-p.thisExp;
									p.thisExp=p.thisExp+p.lv*5;
									System.out.println("-------------------");	
									System.out.println("Level up：");		
									System.out.println("HP*20");	
									System.out.println("Attack*10");	
									System.out.println("Defense*10");	
									System.out.println("-------------------");		
									}
								}else{
									int sl=new Random().nextInt(2)+1;

									v.shuliang=v.shuliang+sl;
									System.out.println("Get: Slime's heart*"+sl);	
									System.out.println("----------------");	
								}

										}
								


							}else{
								if(a==2){
									System.out.println("Run success！");
									cz=2;
									break;
								}else{
									if(a==3){
										cz=3;
										if(hongpin.shuliang>0){
											System.out.println("Use Elementary HP medicine HP+20");
											if(wjxl>p.hp){
												wjxl=p.hp;
											}
											wjxl=wjxl+hongpin.hp;
											
											hongpin.shuliang=hongpin.shuliang-1;
											g--;
											System.out.println(i);
										}else{
											System.out.println("You don't have medicine any more！");
											System.out.println("Get back from the scene！");
											break;
										}
										
									}
						
						
						
					}


						
						
					}
								
									
								}
				if(wjxl>0){
					if(cz==2){
						break;
						
					}else{
						if(cz==3){
							break;
						}
					}
					
					 System.out.println("You win！");

								int sjs=new Random().nextInt(5)+1;
								if(sjs==1){
									qw.shuliang=qw.shuliang+1;
									System.out.println("Get: Slime's crown*1");	
									System.out.println("----------------");	
								}else{
									System.out.println("You win but get nothing！");	
								}

		
							
							}
						
				

				break;
			}else{

				if(fbxz==2&&p.lv>=5){/////////////////////////第二关
					fb=2;
					int wjxl=p.hp;
					
					System.out.println("你来到了一座宫殿，石屑布满了地面！");
					//进入副本1
					System.out.println("你向宫殿中心走去，已经无法回头！！");
					int guanka=new Random().nextInt(10)+1;
					for(int g=0;g!=guanka;g++){

						
						System.out.println("第"+(g+1)+"关"+",共"+guanka+"关");
						
						monster y= new monster("独角翼龙",5,100,50,35);
						System.out.println("独角翼龙:愚蠢的凡人！！");
						System.out.println("你向前走，突然一只【"+y.name+"】拦住了你的去路！");

						int gwxl=y.hp;
						y.show();
						if(wjxl<=0){
							p.end();
							break;
						}
						System.out.println("1.攻击	2.逃跑	3.加血");
						Scanner scn=new Scanner(System.in);
						int a=scn.nextInt();
						if(a==1){
							cz=1;
							System.out.println("你选择了攻击！");
							while(wjxl>0&&gwxl>0){
								
								int wjsh=0;
								int gwsh=0;
								if(p.attack(y.def)<0){
									wjsh=0;
									gwxl=gwxl-wjsh;
									System.out.println("你抬起了拳头狠狠的砸向【"+y.name+"】，造成了"+wjsh+"的伤害");
								}else{
									wjsh=gwxl-p.attack(y.def);
									gwxl=gwxl-p.attack(y.def);
									System.out.println("你抬起了拳头狠狠的砸向【"+y.name+"】，造成了"+p.attack(y.def)+"的伤害");
								}
								if(y.attack(p.def)<0){
									gwsh=0;
									wjxl=wjxl-gwsh;
									System.out.println("【"+y.name+"】使用死亡冲撞，对你造成了"+gwsh+"的伤害");
								}else{
									gwsh=y.attack(p.def);
									wjxl=wjxl-y.attack(p.def);
									System.out.println("【"+y.name+"】使用死亡冲撞，对你造成了"+y.attack(p.def)+"的伤害");
								}

								
								if(wjxl>=p.hp){
									wjxl=p.hp;
									System.out.println(p.name+"的血量:"+wjxl+"/"+p.hp);
								}else{
									if(wjxl<0){
										wjxl=0;
										System.out.println(p.name+"的血量:"+wjxl+"/"+p.hp);
									}else{
										wjxl=wjxl-gwsh;
										System.out.println(p.name+"的血量:"+wjxl+"/"+p.hp);
									}

								}
								if(gwsh>=y.hp){
									gwxl=y.hp;
									System.out.println(y.name+"的血量:"+gwxl+"/"+y.hp);
								}else{
									if(gwxl<0){
										gwxl=0;
									System.out.println(y.name+"的血量:"+gwxl+"/"+y.hp);
									}else{
										gwxl=gwxl-wjsh;
										System.out.println(y.name+"的血量:"+gwxl+"/"+y.hp);
									}
									}
									

								if(wjxl<=0){
									p.end();
									break;
								
								}
								if(gwxl<=0){
									System.out.println("战斗胜利:恭喜你杀死【"+y.name+"】");
									p.exp=p.exp+ y.jjy(y.lv*2);
									System.out.println("获得经验:"+y.jjy(y.lv*2));
									
									p.money=p.money+ y.jjq(y.lv*5);
									System.out.println("获得金币:"+ y.jjq(y.lv*5));
									if(y.jwp(true)){


										hongpin1.shuliang=hongpin1.shuliang+1;
										System.out.println("获得物品:中级HP药剂*1");	
										System.out.println("----------------");	

										
									
									if(p.exp>=p.thisExp){
										p.lv=p.lv+1;
										p.hp=p.hp+20;
										p.att=p.att+10;
										p.def=p.def+10;
										p.exp=p.exp-p.thisExp;
										p.thisExp=p.thisExp+p.lv*5;
										System.out.println("-------------------");	
										System.out.println("恭喜升级,获得以下属性：");		
										System.out.println("血量*20");	
										System.out.println("攻击*10");	
										System.out.println("防御*10");	
										System.out.println("-------------------");		
										}
									}else{
										int sl=new Random().nextInt(2)+1;

										dj.shuliang=dj.shuliang+sl;
										System.out.println("获得物品:"+dj.name+"*"+sl);	
										System.out.println("----------------");	
									}

											}
									}


								}else{
									if(a==2){
										System.out.println("逃跑成功！");
										cz=2;
										break;
									}else{
										if(a==3){
											cz=3;
											if(hongpin1.shuliang>0){
												System.out.println("使用"+hongpin1.name+"成功，血量+"+hongpin1.hp);
												if(wjxl>p.hp){
													wjxl=p.hp;
												}
												wjxl=wjxl+hongpin1.hp;
												
												hongpin1.shuliang=hongpin1.shuliang-1;
												g--;
											}else{
												System.out.println("没有药水了！");
												System.out.println("自动退出副本！");
												break;
											}
											
										}
							
							
							
						}


							
							
						}
									
										
									}
					if(wjxl>0){
						if(cz==2){
							break;
							
						}else{
							if(cz==3){
								break;
							}
						}
						
						 System.out.println("恭喜通关！");

									int sjs=new Random().nextInt(5)+1;
									if(sjs==1){
										dx.shuliang=dx.shuliang+1;
										System.out.println("获得物品:"+dx.name);	
										System.out.println("----------------");	
									}else{
										System.out.println("您已通关，但什么都没得到！");	
									}

			
								
								}
							
					

					break;

				}else{
					System.out.println("等级不足，无法进入地图，请重新选择！");
					if(fbxz==3&&p.lv>=10){
						//进入副本3
						fb=3;
						int wjxl=p.hp;
						
						System.out.println("你来到了一座城堡，血迹布满了建筑！！");
						//进入副本1
						System.out.println("你向城堡里走去，忽然身后的门被突然关上！！");
						int guanka=new Random().nextInt(10)+1;
						for(int g=0;g!=guanka;g++){

							
							System.out.println("第"+(g+1)+"关"+",共"+guanka+"关");
							
							monster y= new monster("血色法师",10,500,100,60);
							System.out.println("血色法师:竟敢一个人闯进来送死！！");
							System.out.println("你向前走，突然一只【"+y.name+"】拦住了你的去路！");

							int gwxl=y.hp;
							y.show();
							if(wjxl<=0){
								p.end();
								break;
							}
							System.out.println("1.攻击	2.逃跑	3.加血");
							Scanner scn=new Scanner(System.in);
							int a=scn.nextInt();
							if(a==1){
								cz=1;
								System.out.println("你选择了攻击！");
								while(wjxl>0&&gwxl>0){
									
									int wjsh=0;
									int gwsh=0;
									if(p.attack(y.def)<0){
										wjsh=0;
										gwxl=gwxl-wjsh;
										System.out.println("你抬起了拳头狠狠的砸向【"+y.name+"】，造成了"+wjsh+"的伤害");
									}else{
										wjsh=gwxl-p.attack(y.def);
										gwxl=gwxl-p.attack(y.def);
										System.out.println("你抬起了拳头狠狠的砸向【"+y.name+"】，造成了"+p.attack(y.def)+"的伤害");
									}
									if(y.attack(p.def)<0){
										gwsh=0;
										wjxl=wjxl-gwsh;
										System.out.println("【"+y.name+"】使用血之祭祀，对你造成了"+gwsh+"的伤害");
									}else{
										gwsh=y.attack(p.def);
										wjxl=wjxl-y.attack(p.def);
										System.out.println("【"+y.name+"】使用血之祭祀，对你造成了"+y.attack(p.def)+"的伤害");
									}

									
									if(wjxl>=p.hp){
										wjxl=p.hp;
										System.out.println(p.name+"的血量:"+wjxl+"/"+p.hp);
									}else{
										if(wjxl<0){
											wjxl=0;
											System.out.println(p.name+"的血量:"+wjxl+"/"+p.hp);
										}else{
											wjxl=wjxl-gwsh;
											System.out.println(p.name+"的血量:"+wjxl+"/"+p.hp);
										}

									}
									if(gwsh>=y.hp){
										gwxl=y.hp;
										System.out.println(y.name+"的血量:"+gwxl+"/"+y.hp);
									}else{
										if(gwxl<0){
											gwxl=0;
										System.out.println(y.name+"的血量:"+gwxl+"/"+y.hp);
										}else{
											gwxl=gwxl-wjsh;
											System.out.println(y.name+"的血量:"+gwxl+"/"+y.hp);
										}
										}
										

									if(wjxl<=0){
										p.end();
										break;
									
									}
									if(gwxl<=0){
										System.out.println("战斗胜利:恭喜你杀死【"+y.name+"】");
										p.exp=p.exp+ y.jjy(y.lv*2);
										System.out.println("获得经验:"+y.jjy(y.lv*2));
										
										p.money=p.money+ y.jjq(y.lv*5);
										System.out.println("获得金币:"+ y.jjq(y.lv*5));
										if(y.jwp(true)){


											hongpin2.shuliang=hongpin2.shuliang+1;
											System.out.println("获得物品:高级HP药剂*1");	
											System.out.println("----------------");	

											
										
										if(p.exp>=p.thisExp){
											p.lv=p.lv+1;
											p.hp=p.hp+20;
											p.att=p.att+10;
											p.def=p.def+10;
											p.exp=p.exp-p.thisExp;
											p.thisExp=p.thisExp+p.lv*5;
											System.out.println("-------------------");	
											System.out.println("恭喜升级,获得以下属性：");		
											System.out.println("血量*20");	
											System.out.println("攻击*10");	
											System.out.println("防御*10");	
											System.out.println("-------------------");		
											}
										}else{
											int sl=new Random().nextInt(2)+1;

											xbs.shuliang=xbs.shuliang+sl;
											System.out.println("获得物品:"+xbs.name+"*"+sl);	
											System.out.println("----------------");	
										}

												}
										}


									}else{
										if(a==2){
											System.out.println("逃跑成功！");
											cz=2;
											break;
										}else{
											if(a==3){
												cz=3;
												if(hongpin2.shuliang>0){
													System.out.println("使用"+hongpin2.name+"成功，血量+"+hongpin1.hp);
													if(wjxl>p.hp){
														wjxl=p.hp;
													}
													wjxl=wjxl+hongpin2.hp;
													
													hongpin2.shuliang=hongpin2.shuliang-1;
													g--;
												}else{
													System.out.println("没有药水了！");
													System.out.println("自动退出副本！");
													break;
												}
												
											}
								
								
								
							}


								
								
							}
										
											
										}
						if(wjxl>0){
							if(cz==2){
								break;
								
							}else{
								if(cz==3){
									break;
								}
							}
							
							 System.out.println("恭喜通关！");

										int sjs=new Random().nextInt(5)+1;
										if(sjs==1){
											xmn.shuliang=xmn.shuliang+1;
											System.out.println("获得物品:"+xmn.name);	
											System.out.println("----------------");	
										}else{
											System.out.println("您已通关，但什么都没得到！");	
										}

				
									
									}
								
						

						break;
					}else{
						System.out.println("等级不足，无法进入地图，请重新选择！");
						if(fbxz==4&&p.lv>=15){
							fb=4;
							//进入副本4
							System.out.println("你来到了天界入口，天界的守卫似乎很警惕你的出现");
							int wjxl=p.hp;
							//进入副本1
							int guanka=new Random().nextInt(10)+1;
							for(int g=0;g!=guanka;g++){

								
								System.out.println("第"+(g+1)+"关"+",共"+guanka+"关");
								
								monster y= new monster("天界守卫",15,1500,500,300);
								System.out.println("天界守卫:驱逐！！！");
								System.out.println("你向前走，突然一只【"+y.name+"】拦住了你的去路！");

								int gwxl=y.hp;
								y.show();
								if(wjxl<=0){
									p.end();
									break;
								}
								System.out.println("1.攻击	2.逃跑	3.加血");
								Scanner scn=new Scanner(System.in);
								int a=scn.nextInt();
								if(a==1){
									cz=1;
									System.out.println("你选择了攻击！");
									while(wjxl>0&&gwxl>0){
										
										int wjsh=0;
										int gwsh=0;
										if(p.attack(y.def)<0){
											wjsh=0;
											gwxl=gwxl-wjsh;
											System.out.println("你抬起了拳头狠狠的砸向【"+y.name+"】，造成了"+wjsh+"的伤害");
										}else{
											wjsh=gwxl-p.attack(y.def);
											gwxl=gwxl-p.attack(y.def);
											System.out.println("你抬起了拳头狠狠的砸向【"+y.name+"】，造成了"+p.attack(y.def)+"的伤害");
										}
										if(y.attack(p.def)<0){
											gwsh=0;
											wjxl=wjxl-gwsh;
											System.out.println("【"+y.name+"】使用惩戒之光，对你造成了"+gwsh+"的伤害");
										}else{
											gwsh=y.attack(p.def);
											wjxl=wjxl-y.attack(p.def);
											System.out.println("【"+y.name+"】使用惩戒之光，对你造成了"+y.attack(p.def)+"的伤害");
										}

										
										if(wjxl>=p.hp){
											wjxl=p.hp;
											System.out.println(p.name+"的血量:"+wjxl+"/"+p.hp);
										}else{
											if(wjxl<0){
												wjxl=0;
												System.out.println(p.name+"的血量:"+wjxl+"/"+p.hp);
											}else{
												wjxl=wjxl-gwsh;
												System.out.println(p.name+"的血量:"+wjxl+"/"+p.hp);
											}

										}
										if(gwsh>=y.hp){
											gwxl=y.hp;
											System.out.println(y.name+"的血量:"+gwxl+"/"+y.hp);
										}else{
											if(gwxl<0){
												gwxl=0;
											System.out.println(y.name+"的血量:"+gwxl+"/"+y.hp);
											}else{
												gwxl=gwxl-wjsh;
												System.out.println(y.name+"的血量:"+gwxl+"/"+y.hp);
											}
											}
											

										if(wjxl<=0){
											p.end();
											break;
										
										}
										if(gwxl<=0){
											System.out.println("战斗胜利:恭喜你杀死【"+y.name+"】");
											p.exp=p.exp+ y.jjy(y.lv*2);
											System.out.println("获得经验:"+y.jjy(y.lv*2));
											
											p.money=p.money+ y.jjq(y.lv*5);
											System.out.println("获得金币:"+ y.jjq(y.lv*5));
											if(y.jwp(true)){


												hongpin3.shuliang=hongpin3.shuliang+1;
												System.out.println("获得物品:顶级HP药剂*1");	
												System.out.println("----------------");	

												
											
											if(p.exp>=p.thisExp){
												p.lv=p.lv+1;
												p.hp=p.hp+20;
												p.att=p.att+10;
												p.def=p.def+10;
												p.exp=p.exp-p.thisExp;
												p.thisExp=p.thisExp+p.lv*5;
												System.out.println("-------------------");	
												System.out.println("恭喜升级,获得以下属性：");		
												System.out.println("血量*20");	
												System.out.println("攻击*10");	
												System.out.println("防御*10");	
												System.out.println("-------------------");		
												}
											}else{
												int sl=new Random().nextInt(2)+1;

												bqsp.shuliang=bqsp.shuliang+sl;
												System.out.println("获得物品:"+bqsp.name+"*"+sl);	
												System.out.println("----------------");	
											}

													}
											}


										}else{
											if(a==2){
												System.out.println("逃跑成功！");
												cz=2;
												break;
											}else{
												if(a==3){
													cz=3;
													if(hongpin3.shuliang>0){
														System.out.println("使用"+hongpin3.name+"成功，血量+"+hongpin3.hp);
														if(wjxl>p.hp){
															wjxl=p.hp;
														}
														wjxl=wjxl+hongpin3.hp;
														
														hongpin3.shuliang=hongpin3.shuliang-1;
														g--;
													}else{
														System.out.println("没有药水了！");
														System.out.println("自动逃离副本！");
														break;
													}
													
												}
									
									
									
								}

									
									
								}
											
												
											}
							if(wjxl>0){
								if(cz==2){
									break;
									
								}else{
									if(cz==3){
										break;
									}
								}
								
								 System.out.println("恭喜通关！");

											int sjs=new Random().nextInt(5)+1;
											if(sjs==1){
												sbzh.shuliang=sbzh.shuliang+1;
												System.out.println("获得物品:"+sbzh.name);	
												System.out.println("----------------");	
											}else{
												System.out.println("您已通关，但什么都没得到！");	
											}

					
										
										}
									
							

							break;

						}else{
							System.out.println("输入错误，或等级不足！请输入1-4！");
							break;
							
							
						}
						
					}
					
					
				}
				
			}
			
			
			
			default:System.out.println("-------------------");
			
			break;
			
			
					
			case 3:		
				System.out.println("1.100金币兑换10攻击！");
				System.out.println("2.100金币兑换10防御！");
				System.out.println("3.100金币兑换50经验！");
				Scanner qh=new Scanner(System.in);
				int qh1=qh.nextInt();
				if(qh1==1){
					if(p.money>=100){
						p.money=p.money-100;
						p.att=p.att+10;
						System.out.println("提升10！");
					}else{
					System.out.println("很抱歉，金币不够!");
					}
				}else{
					if(qh1==2){
						if(p.money>=100){
							p.money=p.money-100;
							p.def=p.def+10;
							System.out.println("防御值提升10！");
						}else{
						System.out.println("很抱歉，金币不够!");
						}
					}else{
						if(qh1==3){
							if(p.money>=100){
								p.money=p.money-100;
								p.exp=p.exp+50;
								System.out.println("经验值提升50！");
								if(p.exp>=p.thisExp){
									p.lv=p.lv+1;
									p.hp=p.hp+20;
									p.att=p.att+10;
									p.def=p.def+10;
									p.exp=p.exp-p.thisExp;
									p.thisExp=p.thisExp+p.lv*5;
									System.out.println("-------------------");	
									System.out.println("恭喜升级,获得以下属性：");		
									System.out.println("血量*20");	
									System.out.println("攻击*10");	
									System.out.println("防御*10");	
									System.out.println("-------------------");		
									
								}
								
							}else{
								System.out.println("很抱歉，金币不够!");
							}
						}else{
							System.out.println("请输入1-3");
							break;
						}
						
					}
				}
		
				
				break;
				
			case 4:	
				if(p.money>200){
					p.money=p.money-200;
					int jieguo=new Random().nextInt(6)+1;
					switch(jieguo){
					case 1: 
						int exp=new Random().nextInt(200)+1;
						p.exp=p.exp+100+exp;
						System.out.println("恭喜您获得"+exp+"经验值");
						if(p.exp>=p.thisExp){
							p.lv=p.lv+1;
							p.hp=p.hp+20;
							p.att=p.att+10;
							p.def=p.def+10;
							p.exp=p.exp-p.thisExp;
							p.thisExp=p.thisExp+p.lv*5;
							System.out.println("-------------------");	
							System.out.println("恭喜升级,获得以下属性：");		
							System.out.println("血量*20");	
							System.out.println("攻击*10");	
							System.out.println("防御*10");	
							System.out.println("-------------------");		
							}
						break;
					case 2:
						int money=new Random().nextInt(300)+1;
						p.money=p.money+money;
						System.out.println("恭喜您获得"+money+"金币");
						break;
					case 3:
						int gg=new Random().nextInt(20)+1;
						dx.shuliang=dx.shuliang+gg;
						System.out.println("恭喜您获得"+gg+"个"+dx.name);
						break;
					}
					if(jieguo>3){
					System.out.println("再接再厉，请重新尝试！");
					}
					
					
				}else{
					System.out.println("金币不足200，无法抽奖！");
				}
				
				
				
				
				break;
				
			case 5:		
				
				
				
				
				
				break;
			case 6:

				if(hongpin.shuliang!=0){
					System.out.println(hongpin.name+"数量为"+hongpin.shuliang+"个");
				}
				if(hongpin1.shuliang!=0){
					System.out.println(hongpin1.name+"数量为"+hongpin1.shuliang+"个");
				}
				if(hongpin2.shuliang!=0){
					System.out.println(hongpin2.name+"数量为"+hongpin2.shuliang+"个");
				}
				if(hongpin3.shuliang!=0){
					System.out.println(hongpin3.name+"数量为"+hongpin3.shuliang+"个");
				}
				if(v.shuliang!=0){
					System.out.println(v.name+"数量为"+v.shuliang+"个");
				}
				if(qw.shuliang!=0){
					System.out.println(qw.name+"数量为"+qw.shuliang+"个");
				}
				if(dj.shuliang!=0){
					System.out.println(dj.name+"数量为"+dj.shuliang+"个");
				}
				if(dx.shuliang!=0){
					System.out.println(dx.name+"数量为"+dx.shuliang+"个");
				}
				if(xbs.shuliang!=0){
					System.out.println(xbs.name+"数量为"+xbs.shuliang+"个");
				}
				if(xmn.shuliang!=0){
					System.out.println(xmn.name+"数量为"+xmn.shuliang+"个");
				}
				if(bqsp.shuliang!=0){
					System.out.println(bqsp.name+"数量为"+bqsp.shuliang+"个");
				}
				if(sbzh.shuliang!=0){
					System.out.println(sbzh.name+"数量为"+sbzh.shuliang+"个");
				}
					System.out.println("金钱："+p.money);

				
				
				break;
			
			case 7:	p.lv=99;p.att=99999;p.def=99999;p.money=9999999;p.hp=99999;
			int exp=0;
			for(i=0;i<=99;i++){
				exp=exp+i*5;
			}
			
			p.thisExp=exp+100;
			System.out.println("LV:99");
			System.out.println("攻击力:99999");				
			System.out.println("攻击力:99999");
			System.out.println("防御力:99999");
			System.out.println("金钱:9999999");
			break;
				
			}
				

			
				}
				
		
			
				
			
			
			}
				
				
			}
			
		
		}
			
		

			
		
		
		
			

	
	

