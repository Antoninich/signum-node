package brs;

public class IndirectIncoming {
  private final long accountId;
  private final long transactionId;
  private final long amount;
  private final long quantity;
  private final int height;

  public IndirectIncoming(long accountId, long transactionId, long amount, long quantity, int height) {
      this.accountId = accountId;
      this.transactionId = transactionId;
      this.amount = amount;
      this.quantity = quantity;
      this.height = height;
  }

  public long getAccountId() {
      return accountId;
  }

  public long getTransactionId() {
      return transactionId;
  }

  public long getAmount() {
      return amount;
  }
  
  public long getQuantity() {
    return quantity;
  }

  public int getHeight() {
      return height;
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      IndirectIncoming that = (IndirectIncoming) o;

      return accountId == that.accountId && transactionId == that.transactionId
          && amount == that.amount && quantity == that.quantity
          && height == that.height;
  }

  @Override
  public int hashCode() {
      int result = (int) (accountId ^ (accountId >>> 32));
      result = 31 * result + (int) (transactionId ^ (transactionId >>> 32));
      result = 31 * result + height + (int) amount + (int) quantity;
      return result;
  }
}