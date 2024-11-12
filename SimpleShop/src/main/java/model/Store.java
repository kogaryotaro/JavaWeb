package model;

import java.util.List;

public class Store {

	private String name;
	private List<Product> listProd;
	
//	コンストラクタ
	public Store (String name, List<Product> listProd) {
		this.name = name;
		this.listProd = listProd;
	}
	
//ゲッター
	public String getName() {
		return name;
	}
	
	public List<Product> getListProd(){
		return listProd;
	}
	
//	通常メソッド
//	商品の追加
	public void add(Product prod) {
		listProd.add(prod);
	}
//	特定商品の削除
	public void remove(int index) {
		listProd.remove(index);
	}
//	すべての商品削除
	public void clear() {
		listProd.clear();
	}
	
}
