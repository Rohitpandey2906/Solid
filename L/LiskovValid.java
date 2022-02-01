

interface Social{

    public  void Chat();

    public  void SendPhotoAndVideo();
}

interface PostMediaManager{
    public  void PublishPost(String post);
}

interface VideoCallManager{
    public void GroupVideoCall();
}


class Instagram implements Social,PostMediaManager{

    @Override
    public void Chat() {

    }

    @Override
    public void SendPhotoAndVideo() {

    }

    @Override
    public void PublishPost(String post) {

    }
}

public class LiskovValid {
    public static void main(String args[]){
        //According to single responsibility every class should perform single functionality
        //Implementation of multiple functionality violate the rule

    }

    //To validate Liskov principle now we have created multiple interface for every unique functionality.
}