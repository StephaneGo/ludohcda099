package fr.eni.ludotheque.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LudoUserDetailsService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDetails utilisateur = User
                .withUsername("bob")
                .password("azerty")
                .roles("VENDEUR").build();

        return utilisateur;
    }
}
