//alert('script added');
function add_to_cart(pid,pname,pqty,pprice)
{
    console.log("ok ji");
    let cart = localStorage.getItem("cart");
    if(cart==null)
    {
        let products=[];
        let product= {productId:pid,productName:pname,productQty=1,productPprice=pprice};
        products.push(product);
        
        localStorage.setItem("cart",JSON.stringify(products));
    }
    else
    {
        JSON.parse(cart);
        let oldItem=cart.find((item) => item.productId == pid);
        if(oldItem)
        {
            cart.map((item)=>{
                
                if(item.productId == pid)
                {
                    item.productQty++;
                }
                
            });
            localStorage.setItem("cart",JSON.stringify(cart));
        }
        else
        {
            let product= {productId:pid,productName:pname,productQty=1,productPprice=pprice};
            cart.push(product);
            localStorage.setItem("cart",JSON.stringify(cart));
        }
    }
}

