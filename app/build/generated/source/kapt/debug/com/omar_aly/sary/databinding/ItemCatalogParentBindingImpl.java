package com.omar_aly.sary.databinding;
import com.omar_aly.sary.R;
import com.omar_aly.sary.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCatalogParentBindingImpl extends ItemCatalogParentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.list_catalog, 2);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCatalogParentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemCatalogParentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.image.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.catalog == variableId) {
            setCatalog((com.omar_aly.domain.model.catalog.CatalogModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCatalog(@Nullable com.omar_aly.domain.model.catalog.CatalogModel Catalog) {
        this.mCatalog = Catalog;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.catalog);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.omar_aly.domain.model.catalog.CatalogModel catalog = mCatalog;
        int catalogShowTitleViewVISIBLEViewGONE = 0;
        java.lang.String catalogTitle = null;
        boolean catalogShowTitle = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (catalog != null) {
                    // read catalog.title
                    catalogTitle = catalog.getTitle();
                    // read catalog.show_title
                    catalogShowTitle = catalog.getShow_title();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(catalogShowTitle) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read catalog.show_title ? View.VISIBLE : View.GONE
                catalogShowTitleViewVISIBLEViewGONE = ((catalogShowTitle) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, catalogTitle);
            this.mboundView1.setVisibility(catalogShowTitleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): catalog
        flag 1 (0x2L): null
        flag 2 (0x3L): catalog.show_title ? View.VISIBLE : View.GONE
        flag 3 (0x4L): catalog.show_title ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}