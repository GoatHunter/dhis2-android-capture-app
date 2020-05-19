package org.simprints.dhis2.utils.granularsync

import androidx.recyclerview.widget.RecyclerView
import org.simprints.dhis2.databinding.ItemSyncConflictBinding
import org.simprints.dhis2.utils.DateUtils

class SyncConflictHolder(private val binding: ItemSyncConflictBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(trackerImportConflict: StatusLogItem) {
        binding.date.text = DateUtils.dateTimeFormat().format(trackerImportConflict.date())
        binding.message.text = trackerImportConflict.description()
    }
}
