## Test Scenarios

### Authentication (LoginTests)

#### 1. Login with valid user
- Given a standard user  
- When valid credentials are submitted  
- Then the inventory page is displayed  

#### 2. Login with locked user
- Given a locked user  
- When login is attempted  
- Then an error message indicating account lock is shown  

---

### Cart (CartTests)

#### 3. Add item to cart
- Given a logged-in user  
- When an item is added from inventory  
- Then the cart badge count becomes 1  

#### 4. Empty cart on fresh login
- Given a logged-in user  
- Then the cart badge count is 0  

---

### Navigation (NavigationTests)

#### 5. Navigate back from cart to inventory
- Given a user with items in cart  
- When navigating back from the cart  
- Then the inventory page is displayed  

#### 6. Persist cart badge after navigation
- Given a user with an item added  
- When navigating between inventory and cart  
- Then the cart badge count remains unchanged  

---

### Checkout (CheckoutTests)

#### 7. Successful checkout
- Given a logged-in user  
- When an item is added and checkout is completed with valid data  
- Then the checkout completion page is displayed  

#### 8. Checkout validation error
- Given a logged-in user with items in cart  
- When checkout information is submitted empty  
- Then a validation error message is shown  
