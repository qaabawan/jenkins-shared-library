def call() {

    echo 'Running Dev Stage: Data Ingestion and Training...'
    sh '''
        cd /home/kaaba/mlops_assignment
        source venv/bin/activate
        python train.py
    '''

    echo 'Model evaluation completed successfully. Assigned alias: Challenger.'
}
