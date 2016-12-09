import DS from 'ember-data';

export default DS.JSONSerializer.extend({
  normalizeFindRecordResponse(store,type,payload){
    return{
      data:{
        id:payload.hello.id,
        type:type.modelName
      }
    };
  }
});
