package kr.ac.kopo.ohm.bookmarket.service;

import kr.ac.kopo.ohm.bookmarket.domain.Cart;

public interface CartService {
    Cart create(Cart cart);
    Cart read(String cartId);
}