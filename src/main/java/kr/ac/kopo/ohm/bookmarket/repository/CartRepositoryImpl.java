package kr.ac.kopo.ohm.bookmarket.repository;

import kr.ac.kopo.ohm.bookmarket.domain.Cart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CartRepositoryImpl implements CartRepository {
    private Map<String, Cart> listOfCarts;

    public CartRepositoryImpl() {
        listOfCarts = new HashMap<String, Cart>();
    }

    @Override
    public Cart create(Cart cart) {
        if(listOfCarts.containsKey(cart.getCartId())){
            throw new IllegalArgumentException("장바구니를 새로 생성할 수 없습니다. 현재 장바구니 ID("+cart.getCartId()+")가 이미 존재합니다.");
        }
        listOfCarts.put(cart.getCartId(), cart);
        return cart;
    }

    @Override
    public Cart read(String cartId) {
        return listOfCarts.get(cartId);
    }
}