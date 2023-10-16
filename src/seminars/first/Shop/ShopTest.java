package seminars.first.Shop;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   */
    @Test
    public void testGetProducts() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 200));
        products.add(new Product("Product 2", 100));
        products.add(new Product("Product 3", 150));

        shop.setProducts(products);

        List<Product> actualProducts = shop.getProducts();
        assertEquals(products.size(), actualProducts.size());
        assertTrue(actualProducts.containsAll(products));
    }
    /*
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   */

    @Test
    public void testGetMostExpensiveProduct() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 200));
        products.add(new Product("Product 2", 100));
        products.add(new Product("Product 3", 150));

        shop.setProducts(products);

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        assertEquals("Product 1", mostExpensiveProduct.getTitle());
        assertEquals(200, mostExpensiveProduct.getCost());
    }

    /* 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
     */
    @Test
    public void testSortProductsByPrice() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 200));
        products.add(new Product("Product 2", 100));
        products.add(new Product("Product 3", 150));

        shop.setProducts(products);

        List<Product> sortedProducts = shop.sortProductsByPrice();
        assertEquals(100, sortedProducts.get(0).getCost());
        assertEquals(150, sortedProducts.get(1).getCost());
        assertEquals(200, sortedProducts.get(2).getCost());
    }

}