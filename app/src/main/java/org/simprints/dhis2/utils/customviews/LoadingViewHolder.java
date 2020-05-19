package org.simprints.dhis2.utils.customviews;

import org.simprints.dhis2.databinding.ItemLoadingBinding;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by frodriguez on 5/20/2019.
 */
public class LoadingViewHolder extends RecyclerView.ViewHolder {
    public LoadingViewHolder(@NonNull ItemLoadingBinding itemView) {
        super(itemView.getRoot());
    }

    public void bind(){
    }
}
