package com.cognizant.account;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccountDetails(@PathVariable String number) {
        // Dummy response - no database
        return new Account(number, "savings", 234343);
    }
}
