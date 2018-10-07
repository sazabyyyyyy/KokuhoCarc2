package com.kaneko.springboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Takuya Kaneko
 *市町村選択クラス
 */
@Controller
public class HokkaidoController {

	@Autowired
	JdbcTemplate jdbcTemplate;

@RequestMapping("/1")
	public ModelAndView city(ModelAndView mav) {
		// TODO 自動生成されたメソッド・スタブ

	 //使用するビューの名前(HTMLファイル名）を入力（テンプレート）
		mav.setViewName("city");
		List<Map<String,Object>>list;
		list=jdbcTemplate.queryForList("select * from hokkaido");
		//テンプレート側の変数（左）に格納した配列変数（右）を保管する
		mav.addObject("hokkaido", list);
		return mav;
	}

@RequestMapping("/2")
public ModelAndView city2(ModelAndView mav) {
	// TODO 自動生成されたメソッド・スタブ

 //使用するビューの名前(HTMLファイル名）を入力（テンプレート）
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from aomori");
	//テンプレート側の変数（左）に格納した配列変数（右）を保管する
	mav.addObject("aomori", list);
	return mav;
}

@RequestMapping("/3")
public ModelAndView city3(ModelAndView mav) {
	// TODO 自動生成されたメソッド・スタブ

 //使用するビューの名前(HTMLファイル名）を入力（テンプレート）
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from iwate");
	//テンプレート側の変数（左）に格納した配列変数（右）を保管する
	mav.addObject("iwate", list);
	return mav;
}

@RequestMapping("/4")
public ModelAndView city4(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from miyagi ");
	mav.addObject("miyagi", list);
	return mav;
}
@RequestMapping("/5")
public ModelAndView city5(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from akita");
	mav.addObject("akita", list);
	return mav;
}
@RequestMapping("/6")
public ModelAndView city6(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from yamagata");
	mav.addObject("yamagata", list);
	return mav;
}
@RequestMapping("/7")
public ModelAndView city7(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from fukushima");
	mav.addObject("fukushima", list);
	return mav;
}
@RequestMapping("/8")
public ModelAndView city8(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ibaragi");
	mav.addObject("ibaragi", list);
	return mav;
}
@RequestMapping("/9")
public ModelAndView city9(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from tochigi");
	mav.addObject("tochigi ", list);
	return mav;
}
@RequestMapping("/10")
public ModelAndView city10(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from  gunma ");
	mav.addObject("gunma", list);
	return mav;
}
@RequestMapping("/11")
public ModelAndView city11(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/12")
public ModelAndView city12(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/13")
public ModelAndView city13(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/14")
public ModelAndView city14(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/15")
public ModelAndView city15(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/16")
public ModelAndView city16(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/17")
public ModelAndView city17(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/18")
public ModelAndView city18(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/19")
public ModelAndView city19(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/20")
public ModelAndView city20(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/21")
public ModelAndView city21(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/22")
public ModelAndView city22(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/23")
public ModelAndView city23(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/24")
public ModelAndView city24(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/25")
public ModelAndView city25(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/26")
public ModelAndView city26(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/27")
public ModelAndView city27(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/28")
public ModelAndView city28(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/29")
public ModelAndView city29(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/30")
public ModelAndView city30(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/31")
public ModelAndView city31(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/32")
public ModelAndView city32(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/33")
public ModelAndView city33(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/34")
public ModelAndView city34(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/35")
public ModelAndView city35(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/36")
public ModelAndView city36(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/37")
public ModelAndView city37(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/38")
public ModelAndView city38(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/39")
public ModelAndView city39(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/40")
public ModelAndView city40(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/41")
public ModelAndView city41(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/42")
public ModelAndView city42(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/43")
public ModelAndView city43(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/44")
public ModelAndView city44(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/45")
public ModelAndView city45(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/46")
public ModelAndView city46(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}
@RequestMapping("/47")
public ModelAndView city47(ModelAndView mav) {
	mav.setViewName("city");
	List<Map<String,Object>>list;
	list=jdbcTemplate.queryForList("select * from ");
	mav.addObject("", list);
	return mav;
}










}
//}
//}
//HKの変数に市町村を格納する。
////thymeleafのeach文とインライン処理で埋め込んだ変数からHTML出力する。
//ArrayList<Dataobject>hk=new ArrayList<Dataobject>();
//hk.add(new Dataobject (1  ,"札幌市"));
//hk.add(new Dataobject (2  ,"函館市"));
//hk.add(new Dataobject (3  ,"小樽市"));
//hk.add(new Dataobject (4  ,"旭川市"));
//hk.add(new Dataobject (5  ,"室蘭市"));
//hk.add(new Dataobject (6  ,"釧路市"));
//hk.add(new Dataobject (7  ,"帯広市"));
//hk.add(new Dataobject (8  ,"北見市"));
//hk.add(new Dataobject (9  ,"夕張市"));
//hk.add(new Dataobject (10 ,"岩見沢市"));
//hk.add(new Dataobject (11 ,"網走市"));
//hk.add(new Dataobject (12 ,"留萌市"));
//hk.add(new Dataobject (13 ,"苫小牧市"));
//hk.add(new Dataobject (14 ,"稚内市"));
//hk.add(new Dataobject (15 ,"美唄市"));
//hk.add(new Dataobject (16 ,"芦別市"));
//hk.add(new Dataobject (17 ,"江別市"));
//hk.add(new Dataobject (18 ,"赤平市"));
//hk.add(new Dataobject (19 ,"紋別市"));
//hk.add(new Dataobject (20 ,"士別市"));
//hk.add(new Dataobject (21 ,"名寄市"));
//hk.add(new Dataobject (22 ,"三笠市"));
//hk.add(new Dataobject (23 ,"根室市"));
//hk.add(new Dataobject (24 ,"千歳市"));
//hk.add(new Dataobject (25 ,"滝川市"));
//hk.add(new Dataobject (26 ,"砂川市"));
//hk.add(new Dataobject (27 ,"歌志内市"));
//hk.add(new Dataobject (28 ,"深川市"));
//hk.add(new Dataobject (29 ,"富良野市"));
//hk.add(new Dataobject (30 ,"登別市"));
//hk.add(new Dataobject (31 ,"恵庭市"));
//hk.add(new Dataobject (32 ,"伊達市"));
//hk.add(new Dataobject (33 ,"北広島市"));
//hk.add(new Dataobject (34 ,"石狩市"));
//hk.add(new Dataobject (35 ,"北斗市"));
//hk.add(new Dataobject (36 ,"南幌町"));
//hk.add(new Dataobject (37 ,"奈井江町"));
//hk.add(new Dataobject (38 ,"上砂川町"));
//hk.add(new Dataobject (39 ,"由仁町"));
//hk.add(new Dataobject (40 ,"長沼町"));
//hk.add(new Dataobject (41 ,"栗山町"));
//hk.add(new Dataobject (42 ,"月形町"));
//hk.add(new Dataobject (43 ,"浦臼町"));
//hk.add(new Dataobject (44 ,"新十津川町"));
//hk.add(new Dataobject (45 ,"妹背牛町"));
//hk.add(new Dataobject (46 ,"秩父別町"));
//hk.add(new Dataobject (47 ,"雨竜町"));
//hk.add(new Dataobject (48 ,"北竜町"));
//hk.add(new Dataobject (49 ,"沼田町"));
//hk.add(new Dataobject (50 ,"当別町"));
//hk.add(new Dataobject (51 ,"新篠津村"));
//hk.add(new Dataobject (52 ,"島牧村"));
//hk.add(new Dataobject (53 ,"寿都町"));
//hk.add(new Dataobject (54 ,"黒松内町"));
//hk.add(new Dataobject (55 ,"蘭越町"));
//hk.add(new Dataobject (56 ,"ニセコ町"));
//hk.add(new Dataobject (57 ,"真狩村"));
//hk.add(new Dataobject (58 ,"留寿都村"));
//hk.add(new Dataobject (59 ,"喜茂別町"));
//hk.add(new Dataobject (60 ,"京極町"));
//hk.add(new Dataobject (61 ,"倶知安町"));
//hk.add(new Dataobject (62 ,"共和町"));
//hk.add(new Dataobject (63 ,"岩内町"));
//hk.add(new Dataobject (64 ,"泊村"));
//hk.add(new Dataobject (65 ,"神恵内村"));
//hk.add(new Dataobject (66 ,"積丹町"));
//hk.add(new Dataobject (67 ,"古平町"));
//hk.add(new Dataobject (68 ,"仁木町"));
//hk.add(new Dataobject (69 ,"余市町"));
//hk.add(new Dataobject (70 ,"赤井川村"));
//hk.add(new Dataobject (71 ,"豊浦町"));
//hk.add(new Dataobject (72 ,"壮瞥町"));
//hk.add(new Dataobject (73 ,"白老町"));
//hk.add(new Dataobject (74 ,"厚真町"));
//hk.add(new Dataobject (75 ,"洞爺湖町"));
//hk.add(new Dataobject (76 ,"安平町"));
//hk.add(new Dataobject (77 ,"むかわ町"));
//hk.add(new Dataobject (78 ,"日高町"));
//hk.add(new Dataobject (79 ,"平取町"));
//hk.add(new Dataobject (80 ,"新冠町"));
//hk.add(new Dataobject (81 ,"浦河町"));
//hk.add(new Dataobject (82 ,"様似町"));
//hk.add(new Dataobject (83 ,"えりも町"));
//hk.add(new Dataobject (84 ,"新ひだか町"));
//hk.add(new Dataobject (85 ,"松前町"));
//hk.add(new Dataobject (86 ,"福島町"));
//hk.add(new Dataobject (87 ,"知内町"));
//hk.add(new Dataobject (88 ,"木古内町"));
//hk.add(new Dataobject (89 ,"七飯町"));
//hk.add(new Dataobject (90 ,"鹿部町"));
//hk.add(new Dataobject (91 ,"森町"));
//hk.add(new Dataobject (92 ,"八雲町"));
//hk.add(new Dataobject (93 ,"長万部町"));
//hk.add(new Dataobject (94 ,"江差町"));
//hk.add(new Dataobject (95 ,"上ノ国町"));
//hk.add(new Dataobject (96 ,"厚沢部町"));
//hk.add(new Dataobject (97 ,"乙部町"));
//hk.add(new Dataobject (98 ,"奥尻町"));
//hk.add(new Dataobject (99 ,"今金町"));
//hk.add(new Dataobject (100,"せたな町"));
//hk.add(new Dataobject (101,"鷹栖町"));
//hk.add(new Dataobject (102,"東神楽町"));
//hk.add(new Dataobject (103,"当麻町"));
//hk.add(new Dataobject (104,"比布町"));
//hk.add(new Dataobject (105,"愛別町"));
//hk.add(new Dataobject (106,"上川町"));
//hk.add(new Dataobject (107,"東川町"));
//hk.add(new Dataobject (108,"美瑛町"));
//hk.add(new Dataobject (109,"上富良野町"));
//hk.add(new Dataobject (110,"中富良野町"));
//hk.add(new Dataobject (111,"南富良野町"));
//hk.add(new Dataobject (112,"占冠村"));
//hk.add(new Dataobject (113,"和寒町"));
//hk.add(new Dataobject (114,"剣淵町"));
//hk.add(new Dataobject (115,"下川町"));
//hk.add(new Dataobject (116,"美深町"));
//hk.add(new Dataobject (117,"音威子府村"));
//hk.add(new Dataobject (118,"中川町"));
//hk.add(new Dataobject (119,"幌加内町"));
//hk.add(new Dataobject (120,"増毛町"));
//hk.add(new Dataobject (121,"小平町"));
//hk.add(new Dataobject (122,"苫前町"));
//hk.add(new Dataobject (123,"羽幌町"));
//hk.add(new Dataobject (124,"初山別村"));
//hk.add(new Dataobject (125,"遠別町"));
//hk.add(new Dataobject (126,"天塩町"));
//hk.add(new Dataobject (127,"猿払村"));
//hk.add(new Dataobject (128,"浜頓別町"));
//hk.add(new Dataobject (129,"中頓別町"));
//hk.add(new Dataobject (130,"枝幸町"));
//hk.add(new Dataobject (131,"豊富町"));
//hk.add(new Dataobject (132,"礼文町"));
//hk.add(new Dataobject (133,"利尻町"));
//hk.add(new Dataobject (134,"利尻富士町"));
//hk.add(new Dataobject (135,"幌延町"));
//hk.add(new Dataobject (136,"美幌町"));
//hk.add(new Dataobject (137,"津別町"));
//hk.add(new Dataobject (138,"斜里町"));
//hk.add(new Dataobject (139,"清里町"));
//hk.add(new Dataobject (140,"小清水町"));
//hk.add(new Dataobject (141,"訓子府町"));
//hk.add(new Dataobject (142,"置戸町"));
//hk.add(new Dataobject (143,"佐呂間町"));
//hk.add(new Dataobject (144,"遠軽町"));
//hk.add(new Dataobject (145,"湧別町"));
//hk.add(new Dataobject (146,"滝上町"));
//hk.add(new Dataobject (147,"興部町"));
//hk.add(new Dataobject (148,"西興部村"));
//hk.add(new Dataobject (149,"雄武町"));
//hk.add(new Dataobject (150,"大空町"));
//hk.add(new Dataobject (151,"音更町"));
//hk.add(new Dataobject (152,"士幌町"));
//hk.add(new Dataobject (153,"上士幌町"));
//hk.add(new Dataobject (154,"鹿追町"));
//hk.add(new Dataobject (155,"新得町"));
//hk.add(new Dataobject (156,"清水町"));
//hk.add(new Dataobject (157,"芽室町"));
//hk.add(new Dataobject (158,"中札内村"));
//hk.add(new Dataobject (159,"更別村"));
//hk.add(new Dataobject (160,"大樹町"));
//hk.add(new Dataobject (161,"広尾町"));
//hk.add(new Dataobject (162,"幕別町"));
//hk.add(new Dataobject (163,"池田町"));
//hk.add(new Dataobject (164,"豊頃町"));
//hk.add(new Dataobject (165,"本別町"));
//hk.add(new Dataobject (166,"足寄町"));
//hk.add(new Dataobject (167,"陸別町"));
//hk.add(new Dataobject (168,"浦幌町"));
//hk.add(new Dataobject (169,"釧路町"));
//hk.add(new Dataobject (170,"厚岸町"));
//hk.add(new Dataobject (171,"浜中町"));
//hk.add(new Dataobject (172,"標茶町"));
//hk.add(new Dataobject (173,"弟子屈町"));
//hk.add(new Dataobject (174,"鶴居村"));
//hk.add(new Dataobject (175,"白糠町"));
//hk.add(new Dataobject (176,"別海町"));
//hk.add(new Dataobject (177,"中標津町"));
//hk.add(new Dataobject (178,"標津町"));
//hk.add(new Dataobject (179,"羅臼町"));
