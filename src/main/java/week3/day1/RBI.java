package week3.day1;

public interface RBI {
public int debitCardCVVCount = 3;
int pinCount = 4;
public void openSavingsAc() ;
/***
 * This method performs transfer fund from the given debit Ac to the given credit Ac no
 * Using a valid banking transactional instrument includes chq or Instruction.
 * The amount mentioned can be debit from the creditor and deposited to the debitor.
 * The insufficient fund in the debit acc may attract charges
 * @param debitAcNo -> 16 digit acc number
 * @param creditAcNo -> 16 digit acc number 
 * @param chqNo -> 6 digit number
 * @param amount -> greater than 0
 * @return true -> when the transfer is completed
 * false -> insufficient funds occurs
 */
public boolean transferFund(int debitAcNo, int creditAcNo, int chqNo, int amount);
}
