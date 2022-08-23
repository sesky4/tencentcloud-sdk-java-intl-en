/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.trtc.v20190722;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trtc.v20190722.models.*;

public class TrtcClient extends AbstractClient{
    private static String endpoint = "trtc.tencentcloudapi.com";
    private static String service = "trtc";
    private static String version = "2019-07-22";

    public TrtcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrtcClient(Credential credential, String region, ClientProfile profile) {
        super(TrtcClient.endpoint, TrtcClient.version, credential, region, profile);
    }

    /**
     *API description:
This API is used to start an on-cloud recording task. It records the audio and video streams in a room and saves them to the specified cloud storage. You can use this API to record the streams in a room separately, or you can mix the streams first and then record the mixed stream.

You can use this API to perform the following operations:
* Specify the anchors whose streams you want or do not want to record by using the `RecordParams` parameter
* Specify the storage service you want to save recording files to by using the `StorageParams` parameter
* Specify transcoding settings for mixed-stream recording, including video resolution, video bitrate, frame rate, and audio quality, by using `MixTranscodeParams`
* Specify the layout of different videos in mixed-stream recording mode or select an auto-arranged layout template

Key concepts:
* Single-stream recording: Record the audio and video of each subscribed user (`UserId`) in a room and save the recording files to VOD.
* Mixed-stream recording: Mix the audios and videos of subscribed users (`UserId`) in a room, record the mixed stream, and save the recording files to VOD.
     * @param req CreateCloudRecordingRequest
     * @return CreateCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudRecordingResponse CreateCloudRecording(CreateCloudRecordingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudRecordingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudRecordingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudRecording");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop a recording task. If a task is stopped successfully, but the uploading of recording files has not completed, the backend will continue to upload the files and will notify you via a callback when the upload is completed.
     * @param req DeleteCloudRecordingRequest
     * @return DeleteCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudRecordingResponse DeleteCloudRecording(DeleteCloudRecordingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCloudRecordingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCloudRecordingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCloudRecording");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the status of a recording task after it starts. It works only when a task is in progress. If the task has already ended when this API is called, an error will be returned.
If a recording file is being uploaded to VOD, the response parameter `StorageFileList` will not contain the information of the recording file. Please listen for the recording file callback to get the information.
     * @param req DescribeCloudRecordingRequest
     * @return DescribeCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudRecordingResponse DescribeCloudRecording(DescribeCloudRecordingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudRecordingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudRecordingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudRecording");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove all users from a room and dismiss the room. It supports all platforms. For Android, iOS, Windows, and macOS, the TRTC SDK needs to be upgraded to v6.6 or above.
     * @param req DismissRoomRequest
     * @return DismissRoomResponse
     * @throws TencentCloudSDKException
     */
    public DismissRoomResponse DismissRoom(DismissRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DismissRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DismissRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DismissRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove all users from a room and close the room. It works on all platforms. For Android, iOS, Windows, and macOS, you need to update the TRTC SDK to version 6.6 or above.
     * @param req DismissRoomByStrRoomIdRequest
     * @return DismissRoomByStrRoomIdResponse
     * @throws TencentCloudSDKException
     */
    public DismissRoomByStrRoomIdResponse DismissRoomByStrRoomId(DismissRoomByStrRoomIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DismissRoomByStrRoomIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DismissRoomByStrRoomIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DismissRoomByStrRoomId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a recording task. It works only when a task is in progress. If the task has already ended when this API is called, an error will be returned. You need to specify all the parameters for each request instead of just the ones you want to modify.
     * @param req ModifyCloudRecordingRequest
     * @return ModifyCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudRecordingResponse ModifyCloudRecording(ModifyCloudRecordingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCloudRecordingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCloudRecordingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCloudRecording");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove a user from a room. It is applicable to scenarios where the anchor, room owner, or admin wants to kick out a user. It supports all platforms. For Android, iOS, Windows, and macOS, the TRTC SDK needs to be upgraded to v6.6 or above.
     * @param req RemoveUserRequest
     * @return RemoveUserResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserResponse RemoveUser(RemoveUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove a user from a room. It allows the anchor, room owner, or admin to kick out a user, and works on all platforms. For Android, iOS, Windows, and macOS, you need to update the TRTC SDK to version 6.6 or above.
     * @param req RemoveUserByStrRoomIdRequest
     * @return RemoveUserByStrRoomIdResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserByStrRoomIdResponse RemoveUserByStrRoomId(RemoveUserByStrRoomIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveUserByStrRoomIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserByStrRoomIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveUserByStrRoomId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to mix streams and relay the mixed stream to CDNs. You can use this API to do the following:
1. Publish (also known as “relay”) the audio/video stream of one anchor to CDNs. For details, see example 2 (starting a task to relay the audio and video of a stream) and example 3 (starting a task to relay only the audio of a stream).
2. Mix the streams of multiple anchors in a room or in different rooms and publish the mixed stream to CDNs. You can use `AudioParams.SubscribeAudioList` to specify the users whose audios are mixed, and use `VideoParams.LayoutParams` to specify the layout of the anchors’ videos. For details, see example 1 (mixing streams and publishing the mixed stream to a CDN).
3. Mix multiple streams in a room according to a template and publish the mixed stream to CDNs. The TRTC backend will detect the change of anchors in the room and adjust the video layout automatically according to the stream mixing template. The following template types are supported:
     - Floating: The entire screen is covered by the video image of the first user who enters the room, and the images of other users are displayed as small images in rows in the bottom-left corner in room entry sequence. The screen allows up to 4 rows of 4 small images, which float over the large main image. Up to 1 large image and 15 small images can be displayed.
     - Grid: The images of all users split the screen evenly. The more the users, the smaller the image dimensions. Up to 16 images are supported.
     - Screen sharing: This is designed for video conferencing and online education. The shared screen (or camera image of the anchor) is always displayed as the large main image, which occupies the left half of the screen, and the images of other users occupy the right half in up to two columns of up to eight small images each. Up to 1 large image and 15 small images can be displayed. If the upstream aspect ratio does not match the output, the large image on the left will be scaled and displayed in whole, while the small images on the right will be cropped.
4. Publish audio/video streams to up to 10 CDNs at a time. You can use `PublishCdnParams.PublishCdnUrl` to specify the URLs of the CDNs to publish to. To publish to Tencent Cloud’s CDN, set `PublishCdnParams.IsTencentCdn` to 1.
5. Configure a server-side callback to have Tencent Cloud send relay status updates to your server in the form of HTTP/HTTPS POST requests. To use the callback for relay events, please contact Technical Support.
Notes:
1. **Because On-Cloud MixTranscoding is a paid feature, calling this API will incur MixTranscoding fees. For details, see [Billing of MixTranscoding and Relay to CDN](https://intl.cloud.tencent.com/document/product/647/47631?lang=en&pg=).**
2. **Relaying to third-party CDNs will incur relaying fees. For details, see [Billing of MixTranscoding and Relay to CDN](https://intl.cloud.tencent.com/document/product/647/47631?lang=en&pg=).**

Others:
1. You need to first call `StartPublishCdnStream` to start a relay task and get the task ID before you can use the `UpdatePublishCdnStream` API to modify the task and `StopPublishCdnStream` to stop the task.
2. To ensure the stability of relaying, you cannot switch between relaying audio only, relaying audio and video, and relaying video only for the same task.
3. To ensure the stability of relaying, you cannot change the video codec, audio codec, audio sample rate, audio bitrate, or sound channels using the `UpdatePublishCdnStream` API.
4. When you relay a single stream, specify both `AudioParams` and `VideoParams` to publish both audio and video, and specify only `AudioParams` to publish audio only. You cannot switch between the two modes during the relaying process. For `VideoParams`, set `Width`, `Height`, `Fps`, `Bitrate`, and `Gop` according to the actual settings used for publishing.
5. The `SequenceNumber` parameter is required when you call `UpdatePublishCdnStream` to change the relaying parameters. It ensures that multiple requests for the same relaying task are in the correct order. The value of `SequenceNumber` increases each time a new request is made for the same task. If `InternalError` is returned, try again using the same `SequenceNumber`. You don’t need to handle the `FailedOperation.OutdateRequest` error.
6. You can create a relay task before anchors enter a room, in which case you need to manually call `StopPublishCdnStream` to stop the task. If you don’t, after all the users whose streams are mixed leave the room, the TRTC backend will wait for the timeout period (`AgentParams.MaxIdleTime`) to elapse before stopping the relaying task.
     * @param req StartPublishCdnStreamRequest
     * @return StartPublishCdnStreamResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishCdnStreamResponse StartPublishCdnStream(StartPublishCdnStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartPublishCdnStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartPublishCdnStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartPublishCdnStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop a relaying task.
     * @param req StopPublishCdnStreamRequest
     * @return StopPublishCdnStreamResponse
     * @throws TencentCloudSDKException
     */
    public StopPublishCdnStreamResponse StopPublishCdnStream(StopPublishCdnStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopPublishCdnStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopPublishCdnStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopPublishCdnStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to change the parameters of a relaying task.
     * @param req UpdatePublishCdnStreamRequest
     * @return UpdatePublishCdnStreamResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePublishCdnStreamResponse UpdatePublishCdnStream(UpdatePublishCdnStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePublishCdnStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePublishCdnStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdatePublishCdnStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
