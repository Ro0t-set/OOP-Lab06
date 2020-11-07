package it.unibo.oop.lab.exception2;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * JUnit test to test {@link StrictBankAccount}.
 * 
 */
public class TestStrictBankAccount {
    private static final int INITIAL_AMOUNT = 10_000;
    private static final int TOO_MUCH = 50_000;
	/**
	 * Used to test Exceptions on {@link StrictBankAccount}.
	 */
	@Test
	public void testBankOperations() {
		/*
		 * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a scelta,
		 * con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
		 */
        final AccountHolder usr1 = new AccountHolder("Mario", "Rossi", 1);
        final AccountHolder usr2 = new AccountHolder("Luigi", "Bianchi", 2);
        final StrictBankAccount account1 = new StrictBankAccount(usr1.getUserID(), INITIAL_AMOUNT, 10);
        final StrictBankAccount account2 = new StrictBankAccount(usr2.getUserID(), INITIAL_AMOUNT, 10);
		/*
		 * 2) Effetture un numero di operazioni a piacere per verificare che le
		 * eccezioni create vengano lanciate soltanto quando opportuno, cioè in presenza
		 * di un id utente errato, oppure al superamento del numero di operazioni ATM
		 * gratuite.
		 */

		try {
			account1.withdraw(3, 10);
			fail();
		} catch (WrongAccountHolderException e) {
			assertNotNull(e);
		}
		
		try {
			for(int i = 0; i<=20; i++) {
				account2.depositFromATM(2, 10);
			}
			fail();
		} catch (TransactionsOverQuotaException e) {
			assertNotNull(e);
		}
		
		
		try {
			account1.withdraw(1, TOO_MUCH);
			fail();
		} catch (NotEnoughFoundsException e) {
			assertNotNull(e);
		}
	}
}
