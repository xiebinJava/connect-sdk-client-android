package com.globalcollect.gateway.sdk.client.android.exampleapp.activities;

public class ShoppingCartActivity extends Activity {
	
	public RenderShoppingCart shoppingCartRenderer;
	
	/**
	 * Show shoppingcartDetails view
	 * @param view
	 */
	public void showShoppingCartDetailView(View view) {
		shoppingCartRenderer.showDetailView();
	}
	
	
	/**
	 * Hide shoppingcartDetails view
	 * @param view
	 */	
	public void hideShoppingCartDetailView(View view) {
		shoppingCartRenderer.hideDetailView();
	}
}