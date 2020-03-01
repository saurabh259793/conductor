package com.netflix.conductor.core.execution.tasks;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ReminderApi {

    @Headers({
            "Accept: text/plain",
            "Content-Type: application/json"
    })
    @POST("/v2/reminder/bulk")
    Call<okhttp3.ResponseBody> setReminder(@Body ReminderPayload reminderPayload);
}
