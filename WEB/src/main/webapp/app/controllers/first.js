import Ember from 'ember';

export default Ember.Controller.extend({

  appName: "Hello I am First Page",

  actions:{
    callbackEndAPI: function(){
      var self = this;
      var data = "";
      this.store.findRecord('hello', 1).then(function(response){
        for(var key in response.data.content)
        {
          data = data + (response.data.content)[key] ;
        }
        self.set('model', data.htmlSafe());
      });
    }
  }
});
