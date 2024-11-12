package model;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

public class Operation {
	
	public boolean loginProc(String userId, String password, HttpSession session) {
		
//		ログイン認証
		boolean result = authenticate(userId, password);
		
		if(result) {
			
//			店舗データ作成→セッション格納
			Store store = makeStore();
			session.setAttribute("store", store);
			
//			カート情報作成(userId, 商品リストの新規作成) →セッション格納
			Cart cart = new Cart(userId, new ArrayList<Product>());
			session.setAttribute("cart", cart);
		}
		return result;
	}
	
	private boolean authenticate(String userId, String password) {
		
//		ここではパスワードが"pass"であればtrueとする
		boolean result = password.equals("pass");
		
		return result;
	}
	
	private Store makeStore() {
		
//		店舗情報作成
		Store store = new Store("古賀PC販売", new ArrayList<Product>());
		

		// 商品追加
		store.add(new Product("A110", "無線マウス", 2000));
		store.add(new Product("A120", "薄型キーボード", 3600));
		store.add(new Product("A130", "Webカメラ", 3900));
		store.add(new Product("A140", "トラックボールマウス", 2900));
		store.add(new Product("A150", "USB接続HDD（外付け）", 9800));
		store.add(new Product("A160", "2m電源タップ５口", 1900));
		store.add(new Product("A170", "USB接続マイク", 3500));
		store.add(new Product("A180", "小型ディスプレイ", 11000));
		store.add(new Product("A190", "LED照明", 4200));
		store.add(new Product("A200", "骨伝導イヤホン", 7800));
		
		return store;
	}
	
//	ログアウト処理
	public void logoutProc(HttpSession session) {
		session.invalidate();
	}

}
