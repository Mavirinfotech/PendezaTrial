package com.mavirinfotech.pendeza.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mavirinfotech.pendeza.Interface.ItemClickListner;
import com.mavirinfotech.pendeza.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{

    public TextView txtProductName, txtProductDescription, txtProductPrice;
    public ImageView imageView;
    private ItemClickListner listner;


    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.product_image);
        txtProductName = (TextView) itemView.findViewById(R.id.product_name);
        txtProductDescription = (TextView) itemView.findViewById(R.id.product_description);
        txtProductPrice = (TextView) itemView.findViewById(R.id.product_price);

    }


   public void setItemClickListner(ItemClickListner listner)
   {
        this.setListner(listner);
    }

    @Override
    public void onClick(View view)
    {
        getListner().onClick(view, getAdapterPosition(),false);
    }


    public ItemClickListner getListner() {
        return listner;
    }

    public void setListner(ItemClickListner listner) {
        this.listner = listner;
    }
}
