package org.systers.mentorship.viewmodels;

import java.lang.System;

/**
 * * This class represents the [ViewModel] used for Tasks Screen
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007J\u0010\u0010-\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0007J \u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0007R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00061"}, d2 = {"Lorg/systers/mentorship/viewmodels/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "completeTasksList", "Lkotlin/Function0;", "", "Lorg/systers/mentorship/models/Task;", "getCompleteTasksList", "()Lkotlin/jvm/functions/Function0;", "setCompleteTasksList", "(Lkotlin/jvm/functions/Function0;)V", "incompleteTasksList", "getIncompleteTasksList", "setIncompleteTasksList", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "successfulAdd", "Landroidx/lifecycle/MutableLiveData;", "", "getSuccessfulAdd", "()Landroidx/lifecycle/MutableLiveData;", "successfulGet", "getSuccessfulGet", "successfulUpdate", "getSuccessfulUpdate", "tag", "getTag", "setTag", "taskDataManager", "Lorg/systers/mentorship/remote/datamanager/TaskDataManager;", "tasksList", "getTasksList", "()Ljava/util/List;", "setTasksList", "(Ljava/util/List;)V", "addTask", "", "relationId", "", "createTask", "Lorg/systers/mentorship/remote/requests/CreateTask;", "getTasks", "updateTask", "taskId", "isChecked", "app_release"})
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tag;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<org.systers.mentorship.models.Task> tasksList;
    private final org.systers.mentorship.remote.datamanager.TaskDataManager taskDataManager = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> successfulGet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> successfulAdd = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> successfulUpdate = null;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<? extends java.util.List<org.systers.mentorship.models.Task>> completeTasksList;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<? extends java.util.List<org.systers.mentorship.models.Task>> incompleteTasksList;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.systers.mentorship.models.Task> getTasksList() {
        return null;
    }
    
    public final void setTasksList(@org.jetbrains.annotations.NotNull()
    java.util.List<org.systers.mentorship.models.Task> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSuccessfulGet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSuccessfulAdd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSuccessfulUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<java.util.List<org.systers.mentorship.models.Task>> getCompleteTasksList() {
        return null;
    }
    
    public final void setCompleteTasksList(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.util.List<org.systers.mentorship.models.Task>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<java.util.List<org.systers.mentorship.models.Task>> getIncompleteTasksList() {
        return null;
    }
    
    public final void setIncompleteTasksList(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.util.List<org.systers.mentorship.models.Task>> p0) {
    }
    
    /**
     * * This function lists all tasks from the mentorship relation
     */
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getTasks(int relationId) {
    }
    
    /**
     * * This function helps in adds a new task to the task list
     *     * @param relationId relation for which task is to be added
     *     * @param createTask to serialize task description
     */
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void addTask(int relationId, @org.jetbrains.annotations.NotNull()
    org.systers.mentorship.remote.requests.CreateTask createTask) {
    }
    
    /**
     * * This function helps in updating completed tasks
     *     * @param taskId id of the task that is clicked
     *     * @param isChecked boolean value to specify if the task was marked or unmarked
     *     * @param relationId id of relation
     */
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void updateTask(int taskId, boolean isChecked, int relationId) {
    }
    
    public TasksViewModel() {
        super();
    }
}