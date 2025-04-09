function displayOrder(products) {
   let totalPrice = 0;
   let totalQuantity = 0;
   let totalDiscount = 0;
   
   products.forEach(product => {
      const productTotal = product.price * product.quantity;
      const productDiscount = generateProductDiscount(productTotal);
      const productTotalAfterDiscount = productTotal - productDiscount;

      totalDiscount += productDiscount;
      totalPrice += productTotal;
      totalQuantity += product.quantity;

      printProductLine(product, productTotal, productDiscount, productTotalAfterDiscount);
   });

   printSummary(totalQuantity, totalPrice, totalDiscount);
}

function generateProductDiscount(total) {
   if (total > 200) return total * 0.2;
   if (total > 100) return total * 0.1;     
   return 0;
}

function formatCurrency(amount) {
   //return `€${amount.toLocaleString('en')}.00`;
   return `€${amount.toLocaleString('en', { minimumFractionDigits: 2, maximumFractionDigits: 2 })}`;

}

function printProductLine(product, total, discount, subtotal) {
  console.log(`${product.name}: ${formatCurrency(product.price)} x ${product.quantity} = ${formatCurrency(total)}`);
  console.log(`Discount: ${formatCurrency(discount)}`);
  console.log(`Subtotal: ${formatCurrency(subtotal)}`);
  console.log('');
}

function printSummary(quantity, price, discount) {
  console.log('----------------------------');
  console.log(`Total ${quantity} items`);
  console.log(`Total amount ${formatCurrency(price)}`);
  console.log(`Total discount ${formatCurrency(discount)}`);
  console.log(`Total after discount ${formatCurrency(price - discount)}`);
}
