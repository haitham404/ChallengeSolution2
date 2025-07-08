# Book Store


## Features

### 📚 Book Management
- Define books with **ISBN**, **title**, **author**, **year**, **price**, and **quantity** (for PaperBooks).

#### Book Types:
- **PaperBook**: Physical books with stock and shipping capability.
- **Ebook**: Digital books with file type (e.g., PDF) and email delivery.
- **DemoBook**: Showcase/demo books, not for sale.

---

### 🗃 Inventory Operations
- Add books to inventory with all required details.
- Remove outdated books (published before a specified year).
- List all books currently in inventory.

---

###  Purchase Operations
- Buy books by providing:
  - **ISBN**
  - **Quantity**
  - **Email** (for Ebooks)
  - **Shipping Address** (for PaperBooks)
- Automatically reduces stock for PaperBooks after successful purchase.
- Prevents purchases of:
  - Out-of-stock PaperBooks
  - DemoBooks
  - Books with missing required info (email/address)
  - Non-existent books

---

### Checkout & Output
- Prints detailed purchase receipt:
  - Total paid amount
  - Delivery or shipping info

 
 ##  Exception Testing Guide

In the test class `QuantumBookstoreFullTest.java`, you'll find **commented-out code blocks** designed to test specific exception scenarios.  
Each block is labeled to indicate what kind of exception it triggers.

### 📌 Exception Scenarios to Test

| Scenario | Expected Exception |
|----------|--------------------|
| Try to buy a **PaperBook that is out of stock** | `OutOfstockException` |
| Try to buy a **book that does not exist** | `NotFoundException` |
| Try to buy a **DemoBook** (not for sale) | `NotAbleToBuyException` |
| Try to buy a **PaperBook without an address** | `RequierdAdreesException` |
| Try to buy an **Ebook without an email** | `RequierdEmailException` |
| Try to buy a **quantity larger than available** | `OutOfstockException` |

---

### ✅ How to Use

1. **Open** the test file: `QuantumBookstoreFullTest.java`
2. **Uncomment** the relevant test block for the exception you want to check.
3. **Run** the test.
4. **Observe** the output:
   - You should see the correct **exception message** printed to the console.
   - Confirm that the application correctly handles the error (e.g., no book is added to cart, balance is unchanged, etc.).

> This setup ensures your application gracefully handles invalid operations and provides clear, custom error messages.


