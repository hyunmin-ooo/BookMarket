package kr.ac.kopo.ohm.bookmarket.service;

import kr.ac.kopo.ohm.bookmarket.domain.Cart;
import kr.ac.kopo.ohm.bookmarket.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart create(Cart cart) {
        return cartRepository.create(cart);
    }

    @Override
    public Cart read(String cartId) {
        return cartRepository.read(cartId);
    }
}