import Ember from 'ember';

export default Ember.Controller.extend({

  appName: "Hello I am First Page",

  actions:{
    callbackEndAPI: function(){
      this.store.findRecord('hello', 1).then(function(response){
        console.log("see the response"+response);
      });
    }
  }
});
