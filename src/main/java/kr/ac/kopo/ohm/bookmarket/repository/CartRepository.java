package kr.ac.kopo.ohm.bookmarket.repository;

import kr.ac.kopo.ohm.bookmarket.domain.Cart;

public interface CartRepository {
    Cart create(Cart cart);
    Cart read(String cartId);
}