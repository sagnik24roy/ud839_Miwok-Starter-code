package com.example.android.miwok;

        import android.media.MediaPlayer;
        import android.provider.UserDictionary;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutCompat;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.GridView;
        import android.widget.LinearLayout;
        import android.widget.ListView;
        import android.widget.TextView;

        import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("two","ottiko",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("three","tolook",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("six","temokka",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("nine","Wo'e",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("Ten","na'accha",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter Adapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                      Word word=words.get(position);
                       MediaPlayer  mMediaPlayer = MediaPlayer.create(Numbers.this,word.getAudioresourceid());
                                mMediaPlayer.start();


    };
    });
};}