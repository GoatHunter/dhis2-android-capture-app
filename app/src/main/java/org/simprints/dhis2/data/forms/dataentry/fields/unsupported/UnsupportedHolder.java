package org.simprints.dhis2.data.forms.dataentry.fields.unsupported;

import org.simprints.dhis2.data.forms.dataentry.fields.FormViewHolder;
import org.simprints.dhis2.databinding.FormUnsupportedCustomBinding;
import org.simprints.dhis2.utils.customviews.UnsupportedView;


public class UnsupportedHolder extends FormViewHolder {

    private final UnsupportedView unsupportedView;

    public UnsupportedHolder(FormUnsupportedCustomBinding binding) {
        super(binding);
        unsupportedView = binding.unsupportedView;
    }

    public void update(UnsupportedViewModel viewModel) {
        unsupportedView.setLabel(viewModel.label());
        descriptionText = viewModel.description();
        label = new StringBuilder().append(viewModel.label());
    }
}
