        var sum=0;
        var profit=0;
        var n=0;
        var numberProfit=0;

        n=readline();

        for(var i=0;i<n;i++){
            numberProfit=readline();
            if(sum>0){sum=parseInt(sum)+ parseInt(numberProfit);}else sum=numberProfit;
            if(sum>profit){profit=sum;}
        }
        putstr(profit);
