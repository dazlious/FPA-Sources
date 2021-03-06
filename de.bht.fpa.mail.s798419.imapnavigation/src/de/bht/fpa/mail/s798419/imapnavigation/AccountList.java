package de.bht.fpa.mail.s798419.imapnavigation;

import java.util.ArrayList;
import java.util.Collection;
import de.bht.fpa.mail.s000000.common.mail.model.Account;
import de.bht.fpa.mail.s000000.common.mail.model.builder.AccountBuilder;
import de.bht.fpa.mail.s000000.common.mail.imapsync.ImapHelper;

public class AccountList {
  
  private Collection<Account> accounts;
  
  public AccountList() {
    this.accounts = new ArrayList<Account>();
  }
  
  public AccountList(Account...accounts) {
    this.accounts = new ArrayList<Account>();
    for (Account account : accounts) {
      this.accounts.add(account);
    }
  }
  
  public AccountList(final Collection<Account> accounts) {
    this.accounts = accounts;
  }

  public Collection<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(Collection<Account> accounts) {
    this.accounts = accounts;
  } 
  
  public void addAll(Collection<Account> accounts) {
    this.accounts.addAll(accounts);
  }
  
  public void addAll(Account... accounts) {
    for (Account account : accounts) {
      this.add(account);
    }
  }
  
  public void add(Account account) {
    this.accounts.add(account);
  } 
  
  public static void createAccount(String name, String host, String user, String password) {
      Account account = AccountBuilder.newAccountBuilder()
          .host(host).username(user).password(password).name(name).build();
      ImapHelper.saveAccount(account);
  }
  
}