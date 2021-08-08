package com.omar_aly.sary.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H$\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/omar_aly/sary/base/BaseRecyclerAdapter;", "T", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/omar_aly/sary/base/BaseViewHolder;", "Landroidx/databinding/ViewDataBinding;", "callBack", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "bind", "", "binding", "item", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;)V", "createBinding", "parent", "Landroid/view/ViewGroup;", "viewType", "", "(Landroid/view/ViewGroup;Ljava/lang/Integer;)Landroidx/databinding/ViewDataBinding;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "app_debug"})
public abstract class BaseRecyclerAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.ListAdapter<T, com.omar_aly.sary.base.BaseViewHolder<? extends androidx.databinding.ViewDataBinding>> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.omar_aly.sary.base.BaseViewHolder<androidx.databinding.ViewDataBinding> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.omar_aly.sary.base.BaseViewHolder<? extends androidx.databinding.ViewDataBinding> holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.databinding.ViewDataBinding createBinding(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.Nullable()
    java.lang.Integer viewType);
    
    protected abstract void bind(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding binding, T item);
    
    public BaseRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> callBack) {
        super(null);
    }
}