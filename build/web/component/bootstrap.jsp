<!--bootstrap css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<!--bootstrap js-->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.2.1/css/fontawesome.min.css" integrity="sha384-QYIZto+st3yW+o8+5OHfT6S482Zsvz2WfOzpFSXMF9zqeLcFV0/wlZpMtyFcZALm" crossorigin="anonymous">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha384-...insert integrity hash here..." crossorigin="anonymous">

<link href="style.css" rel="stylesheet"/>

<script >
//            alert('script added');
//            function add_to_cart(pid, pname, pqty, pprice)
//            {

//                console.log("ok ji");
//                let cart = localStorage.getItem("cart");
//                if (cart == null)
//                {
//                    let products = [];
//                    let product = {productId: pid, productName: pname, productQty: 1, productPrice: pprice};
//                    products.push(product);
////                    console.log(product);
//                    localStorage.setItem("cart", JSON.stringify(products));
//                
//                } else
//                {
//                    let pcart =JSON.parse(cart);
//                    let oldItem = pcart.find((item)=>item.productId==pid);
//                    
//                        let flag=false;
//                        pcart.map((item) => {
//
//                            if (item.productId == pid)
//                            {
//                                flag=true;
//                                item.productQty++;
//                            }
//
//                        });
//                        if(flag===false)
//                        {
//                            let product = {productId: pid, productName: pname, productQty: 1, productPrice: pprice};
//                            cart.push(product);
//                        }
//                        localStorage.setItem("cart", JSON.stringify(cart));
//                    
//                }
//            }
//    localStorage.clear();
    function add_to_cart(pid, pname, price)
    {
        let cart = localStorage.getItem("cart");
        if (cart === null)
        {
            let products = [];
            let product = {productId: pid, productName: pname, productQuantity: 1, productPrice: price};
            products.push(product);
            localStorage.setItem("cart", JSON.stringify(products));
        } else
        {
            //cart is already present
            let pcart = JSON.parse(cart);
            let oldProduct = pcart.find((item) => item.productId === pid);

            if (oldProduct)
            {
                //we have to increase the quantity
                oldProduct.productQuantity = oldProduct.productQuantity+1;
                pcart.map((item) => {
                    if (item.productId === oldProduct.productId){
                        item.productQuantity = oldProduct.productQuantity;
                    }
                });
                localStorage.setItem("cart", JSON.stringify(pcart));



            } else
            {
                //we have add the product
                console.log(pcart);
                let product = {productId: pid, productName: pname, productQuantity: 1, productPrice: price};
                pcart.push(product);
                localStorage.setItem("cart", JSON.stringify(pcart));
            }
            
        }
        console.log(localStorage);
    }

</script>